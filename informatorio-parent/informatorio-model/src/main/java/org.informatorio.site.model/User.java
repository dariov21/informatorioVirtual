package org.informatorio.site.model;


public class User {
    private int userID;
    private String UserType;
    private String Nombre;
    private String Apellido;

    public String getUserType(){
        return UserType;
    }
    public void setUserType(String UserType){
        this.UserType=UserType;
    }
    public int getUserID(){
        return userID;
    }
    public void setUserID(int userID){
        this.userID=userID;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String Apellido){
        this.Apellido=Apellido;
    }

}