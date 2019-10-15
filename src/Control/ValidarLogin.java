package Control;
import DAO.UsuarioDAO;
//import Entidad.Sistema;
import Entidad.Usuario;
//import Frontera.FramePrincipal;

/**
 *
 * @author Magnert
 */
public class ValidarLogin {
    //private Sistema sistema = FramePrincipal.sistema;
    private UsuarioDAO dao = new UsuarioDAO();
    public ValidarLogin() {
    }
    public String verificarLogin(Usuario usuario){
        if(!verificarLongitudNombre(usuario.getNombre())){
            return("Longitud Nombre Incorrecta");
        }
        if(!verificarLongitudPassword(usuario.getPassword())){
            return("Longitud Password Incorrecta");
        }
        /*for(Usuario u: sistema.getUsuarios()){
            if(u.getNombre().equals(usuario.getNombre()) && u.getPassword().equals(usuario.getPassword())){
                return("Bienvenido");
            }
        }*/
        if(dao.leer(usuario)!=null){
            return("Bienvenido");
        }
        return("Datos Incorrectos");
    }
    public boolean verificarLongitudNombre(String nombre){
        return(nombre.length()>1 && nombre.length() <=6);
    }
    public boolean verificarLongitudPassword(String password){
        return(password.length()>=3 && password.length() <6);
    }
}
