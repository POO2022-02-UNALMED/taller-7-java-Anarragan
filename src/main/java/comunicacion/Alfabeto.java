package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    
 //Getters and setters
    
    public void setLetras(String[] letras){
        this.letras = letras;
    }
    
    public String[] getLetras(){
        return letras;
    }
    
    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    
 //methods
    
    public int cantidadLetras(){
        return letras.length;
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    
    @Override
    public String toString(){
        String let = "";
        int can = 0;
        int i;
        for (i=0;i<letras.length;i++){
            can+=1;
            if (can==letras.length){    
                let+=letras[i];
            }else{let+=letras[i]+", ";}
        }
        return let;
    }
    
}
