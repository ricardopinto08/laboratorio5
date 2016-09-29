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
import edu.eci.pdsw.samples.services.ExcepcionServiciosForos;
import edu.eci.pdsw.samples.services.ServiciosForo;
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
}
