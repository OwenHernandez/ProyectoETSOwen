package cuentas;

public class CCuenta {


    //Nombre de la cuenta
    private String nombre;
    //Código de la cuenta
    private String cuenta;
    //Saldo de la cuenta
    private double saldo;
    //Tipo de interés
    private double tipoInterés;

    //Constructor por defecto
    public CCuenta()
    {
    }

    //Contructor para todo lo demás
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Te muestra la cantidad de saldo en la cuenta
     * @return Cantidad (en double) del saldo que dispone la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Añade la cantidad dada en el saldo de la cuenta y lanza una excepción si dicha cantidad es negativa
     * @param cantidad a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Resta la cantidad dad en el saldo de la cuenta y lanza una excepción si dicha cantidad es negativa o cero
     * o, si el saldo es menor que la cantidad a retirar
     * @param cantidad a retirar
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * unifica los dos métodos ingresar y retirar y lanza la exception de dichos métodos
     * @param acción, la acción que se desea hacer
     * @param cantidad de dinero que se pretende retirar o ingresar (depende de la acción)
     * @throws Exception 
     */
    public void operativa_cuenta(String acción, float cantidad) throws Exception{
        if (acción.toLowerCase().equals("retirar")){
            this.retirar(cantidad);
        } else if (acción.toLowerCase().equals("ingresar")) {
            this.ingresar(cantidad);
        } 
    }

    /*
    Apartir de aqui son getter y setter
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
