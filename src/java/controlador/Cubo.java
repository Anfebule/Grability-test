/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Ing-0-0013
 */
public class Cubo {
    
    int m[][][];
    
    public Cubo(int dimensiones){
        
        m = new int[dimensiones][dimensiones][dimensiones];
        
        for(int i=0; i<dimensiones; i++){
            for(int j=0; j<dimensiones; j++){
                for(int k=0; k<dimensiones; k++){
                    m[i][j][k] = 0;
                }
            }
        }
    }
    
    public void updateQuery(int x, int y, int z,int w){
        m[x][y][z] = w;
    }
    
    public int query(int x1, int x2, int x3, int y1, int y2, int y3){
        
        int res = 0;
        
        for(int i=x1; i<=y1; i++){
            for(int j=x2; j<=y2; j++){
                for(int k=x3; k<=y3; k++){
                    res += m[i][j][k];
                }
            }
        }
        
        return res;
    }
}
