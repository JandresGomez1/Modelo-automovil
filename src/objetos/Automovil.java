package objetos;
public class Automovil {
    //atributos
    private String marca;
    private int modelo;
    private int motor;
    public enum tipoCombustible{BIOTANOL,DIESEL,BIODIESEL,GAS_NATURAL}
    private tipoCombustible tipo;
    public enum tipoAutomovil{CARRO_DE_CIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,
    EJECUTIVO, SUV }
    private tipoAutomovil tipoauto;
    private int nPuertas;
    private int nAsientos;
    private int vMaxima;
    public enum tipoColor{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA}
    private tipoColor tipocolor;
    private int vActual = 0;
     
    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipo);
        System.out.println("Tipo de automóvil = " + tipoauto);
        System.out.println("Número de puertas = " + nPuertas);
        System.out.println("Cantidad de asientos = " + nAsientos);
        System.out.println("Velocidad máxima = " + vMaxima);
        System.out.println("Color = " + tipocolor);
        System.out.println("Velocidad actual = " + vActual);
     }
    // metodos 
     public void acelerar(int acelerar){
        vActual = vActual + acelerar;
        if(vActual>vMaxima){
            System.out.println("el carro no alcanza esa aceleracion");
        }else{System.out.println("Velocidad actual = "+ vActual);}       
    }
    
    public void desacelerar(int desacelerar){ 
        vActual = vActual - desacelerar;
        if(vActual<0){
            System.out.println("No se puede desacelerar a una velocidad "
                + "negativa");
        }else{System.out.println("Velocidad actual = " + vActual);}
    }
    public void frenar(){
        vActual=0;
        System.out.println("Velocidad actual = " + vActual);
    }
    
    public void tiempo(int distancia){
        double tiempo = distancia / vActual;
        System.out.println("Tiempo es = " + tiempo);
    
    }

    // getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(tipoCombustible tipo) {
        this.tipo = tipo;
    }
    public tipoAutomovil getTipoauto() {
        return tipoauto;
    }

    public void setTipoauto(tipoAutomovil tipoauto) {
        this.tipoauto = tipoauto;
    }
    
    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public int getvMaxima() {
        return vMaxima;
    }

    public void setvMaxima(int vMaxima) {
        this.vMaxima = vMaxima;
    }

    public tipoColor getTipocolor() {
        return tipocolor;
    }

    public void setTipocolor(tipoColor tipocolor) {
        this.tipocolor = tipocolor;
    }

    public int getvActual() {
        return vActual;
    }
    
    public void setvActual(int vActual) {
        this.vActual = vActual;
    }
    //constructor vacio
    public Automovil() {
    }
    
    //constructor con parametros
    public Automovil(String marca, int modelo, int motor, tipoCombustible tipo,
            tipoAutomovil tipoauto,int nPuertas, int nAsientos, int vMaxima, tipoColor tipocolor, 
            int vActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipo = tipo;
        this.tipoauto = tipoauto;
        this.nPuertas = nPuertas;
        this.nAsientos = nAsientos;
        this.vMaxima = vMaxima;
        this.tipocolor = tipocolor;
        this.vActual = vActual;
    }

    
    
    
}
