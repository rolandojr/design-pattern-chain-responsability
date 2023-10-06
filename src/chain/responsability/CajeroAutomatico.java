package chain.responsability;

public class CajeroAutomatico implements IManejador {

    private IManejador sucesor;

    @Override
    public void peticion(int monto) {
        if (monto <= 100) {
            System.out.println("La peticion ha sido atentida por el Cajero Automatico");
        } else {
            sucesor.peticion(monto);
        }
    }

    @Override
    public IManejador getSucesor() {
        return this.sucesor;
    }

    @Override
    public void setSucesor(IManejador sucesor) {
        this.sucesor = sucesor;
    }
}
