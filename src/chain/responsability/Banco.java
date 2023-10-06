package chain.responsability;

public class Banco implements IManejador{

    private IManejador sucesor;

    @Override
    public void peticion(int monto) {

        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico();
        setSucesor(cajeroAutomatico);

        CajeroSucursal cajeroSucursal = new CajeroSucursal();
        cajeroAutomatico.setSucesor(cajeroSucursal);

        AsesorFinanciero asesorFinanciero = new AsesorFinanciero();
        cajeroSucursal.setSucesor(asesorFinanciero);

        sucesor.peticion(monto);

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
