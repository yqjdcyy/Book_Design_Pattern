package compound.mvc.model;

import javax.sound.midi.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Creator: Yao
 * Date:    2018/1/22
 * For:
 * Other:
 */
public class BeatModel implements IBeatModel, MetaEventListener {

    List<IBeatObserver> beatList = new ArrayList<>();
    List<IBPMObserver> bpmList = new ArrayList<>();
    private Sequencer sequencer;
    Sequence sequence;
    Track track;
    int bpm = 90;

    @Override
    public void initialize() {
        setUpMidi();
        buildTrackAndStart();
    }

    private void setUpMidi() {

        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void buildTrackAndStart() {

        int[] trackList = {35, 0, 46, 0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        makeTracks(trackList);
        track.add(makeEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    private void makeTracks(int[] list) {

        for (int i = 0; i < list.length; i++) {
            int key = list[i];

            if (key != 0) {
                track.add(makeEvent(144,9,key, 100, i));
                track.add(makeEvent(128,9,key, 100, i+1));
            }
        }
    }

    private  MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);

        } catch(Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    @Override
    public void on() {
        sequencer.start();
        setBPM(90);
    }

    @Override
    public void off() {
        setBPM(0);
        sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        noticeBPMObservers();
    }

    private void noticeBPMObservers() {

        if (null == bpmList || 0 == bpmList.size())
            return;

        for (IBPMObserver p : bpmList) {
            p.updateBPM();
        }
    }

    @Override
    public int getBPM() {
        return bpm;
    }

    @Override
    public void register(IBeatObserver observer) {
        beatList.add(observer);
    }

    @Override
    public void remove(IBeatObserver observer) {
        beatList.remove(observer);
    }

    @Override
    public void register(IBPMObserver observer) {
        bpmList.add(observer);
    }

    @Override
    public void remove(IBPMObserver observer) {
        bpmList.remove(observer);
    }

    @Override
    public void meta(MetaMessage meta) {

    }
}
