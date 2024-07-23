/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inf_artistas;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Inf_Artistas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Imgresa el Artista que deseas conocer su informacion: \n"
                + "(1) Jisoo \n(2) Luis Miguel \n(3) Shakira \n(4) Thalia \n(5) Juan Gabriel");
        op = sc.nextInt();
        switch(op){
            case 1: System.out.println(" Jisoo es una cantante, actriz y modelo surcoreana, miembro del grupo de chicas BLACKPINK, bajo la compañía YG Entertainment. Nació el 3 de enero de 1995 en Gunpo, Corea del Sur. Debutó con BLACKPINK en 2016 y ha ganado popularidad mundial por sus habilidades vocales y su carisma en el escenario. Además de su carrera musical, Jisoo ha incursionado en la actuación, apareciendo en dramas coreanos.");
            break;
            case 2: System.out.println("Luis Miguel Gallego Basteri, conocido simplemente como Luis Miguel, es un cantante y productor musical mexicano, nacido el 19 de abril de 1970 en San Juan, Puerto Rico. Conocido como \"El Sol de México\", ha tenido una carrera exitosa desde su juventud, con éxitos en géneros como pop, bolero, mariachi y baladas románticas. Ha vendido más de 100 millones de discos y es uno de los artistas más aclamados en la historia de la música en español.");
            break;
            case 3: System.out.println("Shakira Isabel Mebarak Ripoll, conocida como Shakira, es una cantante, compositora y bailarina colombiana, nacida el 2 de febrero de 1977 en Barranquilla, Colombia. Es famosa por su mezcla única de música latina, pop y rock, y por su distintiva voz y movimientos de baile. Shakira ha vendido más de 75 millones de discos y ha ganado numerosos premios, incluyendo varios Grammy y Latin Grammy. Es muy popular en México y en toda América Latina.");
            break;
            case 4: System.out.println("Ariadna Thalía Sodi Miranda, conocida artísticamente como Thalía, es una cantante, actriz y empresaria mexicana, nacida el 26 de agosto de 1971 en Ciudad de México. Comenzó su carrera en la música y la televisión desde muy joven, y es una de las artistas más exitosas y queridas en México y en el mundo hispanohablante. Ha lanzado numerosos álbumes exitosos y protagonizado populares telenovelas, consolidándose como una figura influyente en la cultura pop.");
            break;
            case 5: System.out.println("Alberto Aguilera Valadez, conocido como Juan Gabriel, fue un cantante, compositor y productor mexicano, nacido el 7 de enero de 1950 en Parácuaro, Michoacán, y fallecido el 28 de agosto de 2016 en Santa Mónica, California. Es considerado uno de los artistas más importantes y prolíficos de la música mexicana, conocido por sus emotivas baladas y sus contribuciones al género de la música ranchera. Sus canciones han sido interpretadas por numerosos artistas y su legado sigue siendo celebrado en todo México y más allá.1");
            break;
            default: System.out.println("INGRESA UN NUMERO DEL 1 AL 5");
        }
        // TODO code application logic here
    }
    
}
