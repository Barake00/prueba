
package peluqueria;

import javax.swing.JOptionPane;

public class Persona extends Peluqueria1 {

    private int corteCabello;
    private int corteDama;
    private int tinturaCabello;
    private int peinado;
    private int totalServicios;
    private int totalRecaudo;

    public Persona(int corteCabello, int peinado, int corteDama, int tinturCabello) {
        
        this.corteCabello = corteCabello;
        this.corteDama = corteDama;
        this.tinturaCabello = tinturaCabello;
        this.peinado = peinado;

    }
    public void SetcorteCabello(int corteCabello) {
        this.corteCabello = corteCabello;
    }
    public int GetcorteCabello() {
        return this.corteCabello * 8000;
    }
    public void SetcorteDama(int corteDama) {
        this.corteDama = corteDama;
    }
    public int GetcorteDama() {
        return this.corteDama*10500;
    }
    public void SettinturaCabello(int tinturaCabello) {
        this.tinturaCabello = tinturaCabello;
    }
    public int gettinturaCabello() {
        return this.tinturaCabello*40000;
    }
    public void Setpeinado(int peinado) {
        this.peinado = peinado;
    }
    public int Getpeinado() {
        return this.peinado*15000;
    }
    public void SettotalServicios(int totalServicios) {
        this.totalServicios = totalServicios;
    }
    public int GettotalServicios() {
        return this.totalServicios+peinado+corteCabello+corteDama+tinturaCabello;
    }
    public void SettotalRecaudo(int totalRecaudo) {
        this.totalRecaudo = totalRecaudo;
    }
    public int GettotalRecaudo() {
        return this.totalRecaudo + Getpeinado()+GetcorteCabello()+GetcorteDama()+
                gettinturaCabello();
    }
    public void datos() {
        JOptionPane.showMessageDialog(null, "Digite los datos de los cortes:");
    }

    public void registrarDatos() {
     
        SetcorteCabello(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cantidad de cortes de caballero realizados.")));
        JOptionPane.showMessageDialog(null, GetcorteCabello());
        
        SetcorteDama(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de cortes de dama realizados.")));
        JOptionPane.showMessageDialog(this, GetcorteDama());
        
        Setpeinado(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita la cantidad de peinados realizados")));
        JOptionPane.showMessageDialog(null, Getpeinado());
        
        SettinturaCabello(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de tinturas de cabello realizadas.")));
        JOptionPane.showMessageDialog(this, gettinturaCabello());
        JOptionPane.showMessageDialog(this, "El total de servicios fue de : "+GettotalServicios());
        
        JOptionPane.showMessageDialog(this, "El total de recaudos fue de : "+GettotalRecaudo());   
    }
    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
