package taller.interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface IVerificador {
 
 /**
 * Carga un archivo dado el nombre del mismo (siempre se carga de la ruta ./data)
 * @param nombre Nombre del archivo a cargar de la carpeta data
 * @return la totalidad del contenido del archivo para poder ser procesado por el método hayError
 * @throws IOException Se lanza excepción en caso de no encontrar el archivo o un error de lectura del mismo
 */
 public String cargarArchivo(String nombre) throws IOException;
    
 
    //TODO: implemente el método que lee el Archivo JSON cuyo nombre es pasado por parámetro. Guárdelo en el atributo "verificar".
 
 /**
 * Verifica que el archivo JSON dado por parámetro es incorrecto, retorna la línea donde se encuentra el error. En caso de estar correcto retorna -1
 * @param nombre Representación textual del archivo a validar en formato JSON
 * @return línea donde se encuentra el error. En caso de estar correcto retorna -1
 */
 public int hayError(String json);
    
    //TODO: Implemente el método que verifica si el archivo JSON está correcto.
 //Debe retornar el número de carácter donde se encontró el error, o -1 en caso de que sea correcto.

}

