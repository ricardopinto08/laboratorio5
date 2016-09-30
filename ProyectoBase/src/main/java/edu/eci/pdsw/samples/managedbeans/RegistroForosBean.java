/*
 * Copyright (C) 2016 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.managedbeans;


import edu.eci.pdsw.samples.entities.EntradaForo;
import edu.eci.pdsw.samples.entities.Usuario;
import edu.eci.pdsw.samples.services.ExcepcionServiciosForos;
import edu.eci.pdsw.samples.services.ServiciosForo;
import edu.eci.pdsw.samples.services.ServiciosForoStub;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author hcadavid
 */
@ManagedBean (name= "Foros")
@SessionScoped
public class RegistroForosBean implements Serializable{
    
    private ServiciosForo prin;
    private String date;    
    private String emailUs;
    private String nombreUs,CommentUs,Title;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCommentUs() {
        return CommentUs;
    }

    public void setCommentUs(String CommentUs) {
        this.CommentUs = CommentUs;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmailUs() {
        return emailUs;
    }

    public void setEmailUs(String emailUs) {
        this.emailUs = emailUs;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }
    
    ServiciosForo foros=ServiciosForo.getInstance();
    EntradaForo foroSelection;

    public EntradaForo getForoSelection() {
        return foroSelection;
    }

    public void setForoSelection(EntradaForo foroSelection) {
        this.foroSelection = foroSelection;
    }
    
    
    public List<EntradaForo> getForos() throws ExcepcionServiciosForos{
        return foros.consultarEntradasForo();
    }
    
    public void limpiar(){
        foroSelection=null;
    }
    
    public void registrarNuevoForo(){
        
        prin.registrarNuevaEntradaForo(foroSelection);
    }
}
