public class CeilingFan {
    private State state;

    public CeilingFan() {
        state = new Off();
        state.setFan(this);
    }

    public void pull() {
        state.pull();
        state.setFan(this);
    }

    public void setState(State state) {
        this.state = state;
    }   

    public String getState() {
        return state.getClass().getCanonicalName();
    }
}
