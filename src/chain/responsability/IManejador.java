package chain.responsability;

public interface IManejador {

    void peticion(int monto);

    IManejador getSucesor();

    void setSucesor(IManejador sucesor);
}
