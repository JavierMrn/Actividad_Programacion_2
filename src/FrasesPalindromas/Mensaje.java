package FrasesPalindromas;

public class Mensaje{
    //Atributos
    private String frase;
    
    //Constructores
    public Mensaje(){
        this.frase = "";
    }
    
    public Mensaje(String palabra){
        this.frase = palabra;
    }
    
    //Metodo Para Eliminar Espacios
    public void darFormato(){
        frase = frase.replace(".", ""); //Metodo interno que remplaza todo un caracter por otro.
        frase = frase.replace(" ", "");
        frase = frase.toLowerCase(); //Metodo interno para transformar un string a minusculas.
    } 
    
    //Metodos Geters and Seters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    
    
    //////***Metodos internos y opcionales para hacer las conversiones***//////
    /*
    //Metodo que elimina los puntos, espacios en blanco y saltos de linea
    private String eliminarEspacios(){
        String newString = "";
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ' && frase.charAt(i) != '\n' && frase.charAt(i) != '.'){
                newString += frase.charAt(i);
            }
        }
        return newString;
    }
    */
    
    /*
    //Metodo para transformar todo a minusculas.
    private String transformarAMinusculas(){
        String newString = "";
        
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)){
                case 'A': newString += 'a'; break;  
                case 'B': newString += 'b'; break;
                case 'C': newString += 'c'; break; 
                case 'D': newString += 'd'; break; 
                case 'E': newString += 'e'; break; 
                case 'F': newString += 'f'; break; 
                case 'G': newString += 'g'; break; 
                case 'H': newString += 'h'; break; 
                case 'I': newString += 'i'; break;
                case 'J': newString += 'j'; break; 
                case 'K': newString += 'k'; break; 
                case 'L': newString += 'l'; break; 
                case 'M': newString += 'm'; break; 
                case 'N': newString += 'n'; break; 
                case 'O': newString += 'o'; break; 
                case 'P': newString += 'p'; break; 
                case 'Q': newString += 'q'; break; 
                case 'R': newString += 'r'; break; 
                case 'S': newString += 's'; break; 
                case 'T': newString += 't'; break; 
                case 'V': newString += 'v'; break; 
                case 'W': newString += 'w'; break; 
                case 'X': newString += 'x'; break;
                case 'Y': newString += 'y'; break; 
                case 'Z': newString += 'z'; break;
                default: newString += frase.charAt(i); break;
            }
        }    
        return newString;
    }
    */
}
