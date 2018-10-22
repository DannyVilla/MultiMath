/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/*

public class Profesor {
    private int id;
    private String usuario;
    private String password;

    public Profesor(int id, String usuario, String password) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
    }

    public Profesor() {
       
    }

    //Constructor para albergar los datos de la BD

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
    
    
    /**
     * Metodos MYSQL para la BD
     * @param profe
     * @return 
     */
    /*
    public boolean login(Profesor profe){
        PreparedStatement preparedstatement = null;
        Connection connection = null;
        ResultSet resultset = null;
        //Metodo para acceder a la base de datos
        try {
            preparedstatement = connection.prepareStatement("SELECT id, usuario, password FROM profesor WHERE usuario = ? ");
            preparedstatement.setString(1, profe.getUsuario());
            resultset = preparedstatement.executeQuery();
            //Si el resultado es correcto , entra a un validador de contraseña y
            //Procede al siguiente punto del programa
            if(resultset.next()){
                if(profe.getPassword().equals(resultset.getString(3))){
                    profe.setId(resultset.getInt(1));
                    profe.setUsuario(resultset.getString(2));
                    return true;
                }else{
                    return false;
                }       
            }
            return false;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Hubo un error en la verificacion del usuario");
            return false;
        }
    }
    
}
*/