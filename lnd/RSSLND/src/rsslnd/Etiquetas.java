/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsslnd;

/**
 *
 * @author Raul
 */
class Etiquetas {

    
    /**
     * metodo para definir la etiqueta version
     * @return version del xml
     */
    public String etiquetaVersion() {
        return "<?xml version=\"1.0\"?>\n";
    }

    /**
     * metodo para crear la etiqueta RSS
     * @return eltiqueta RSS abierta
     */
    public String crearEtiquetaAtributo(String atributo) {
        return "<rss " + atributo+ "/>\n" ;
    } 
    
    /**
     * Este metodo es usado para crear etiquetas que guardan otras etiquetas
     * @param etiqueta de la clase
     * @param estadoEtiqueta si el parametro pasado es true crea la etiquet apero si el false lo cierra
     * @return etiqueta abierta o cerrada
     */
    public String etiquetaContenedora(String etiqueta, boolean estadoEtiqueta) {
        
        if (estadoEtiqueta == true) {
            return "<" + etiqueta + ">\n";
        }else{
            return "</" + etiqueta + ">\n";
        }
    }
    
    /**
     * Este metodo es usado para etiquetas que unicamente alberga contenido y no otras etiquetas
     * @param etiqueta de la clase
     * @param contenido de la etiqueta
     * @return etiqueta abyerta con su contenido y posteriormente cerrada
     */
    public String etiquetaContenido(String etiqueta, String contenido){
        
        return "<" + etiqueta + "> " +contenido+ " </" + etiqueta + ">\n";
        
    }

}
