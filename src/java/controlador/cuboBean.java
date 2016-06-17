/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ing-0-0013
 */
@ManagedBean
@SessionScoped
public class cuboBean {
    
    private String textoIngreso = "";
    private String textoResultado = "";

    public String getTextoResultado() {
        return textoResultado;
    }

    public void setTextoResultado(String textoResultado) {
        this.textoResultado = textoResultado;
    }

    public String getTextoIngreso() {
        return textoIngreso;
    }

    public void setTextoIngreso(String textoIngreso) {
        this.textoIngreso = textoIngreso;
    }
    
    public void resolver(){
        textoResultado = "";
        String[] textoEnLineas = textoIngreso.split("\\n");
        int testCases = Integer.parseInt(textoEnLineas[0].trim());
        int testCasesCounter = 0;
        String[] dimAndQuery ;
        
        Cubo cubo = new Cubo();
        
        String query;
        int contadorLineas = 1;
        
        while (testCasesCounter < testCases){
            
            dimAndQuery = textoEnLineas[contadorLineas].split("\\s");
            cubo.inicializarCubo(Integer.parseInt(dimAndQuery[0].trim()));
            contadorLineas += 1;
            
            for(int i=0; i<Integer.parseInt(dimAndQuery[1].trim()); i++){
                query = textoEnLineas[contadorLineas];
                String[] split = query.split("\\s");

                if(query.startsWith("UPDATE")){
                    cubo.updateQuery(Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()), Integer.parseInt(split[3].trim()), Integer.parseInt(split[4].trim()));
                } else if (query.startsWith("QUERY")){
                    textoResultado += cubo.query(Integer.parseInt(split[1].trim()), Integer.parseInt(split[2].trim()), Integer.parseInt(split[3].trim()), Integer.parseInt(split[4].trim()), Integer.parseInt(split[5].trim()), Integer.parseInt(split[6].trim()));
                    textoResultado += "\n";
                } else {
                    textoResultado = "La cantidad de consultas especificada no fue correcta";
                }
                contadorLineas += 1;
            }
            testCasesCounter+= 1;
        }
    }
}
