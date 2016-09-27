/*
 * Copyright (C) 2015 hcadavid
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
package edu.eci.pdsw.samples.tests;

import edu.eci.pdsw.samples.entities.*;
import edu.eci.pdsw.samples.services.ServiciosForoStub;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcadavid
 * 
 * 
 * 
 * CLASES DE EQUIVALENCIA
 * 1)
 * 
 * Condicion de entrada:
 * EntradaForo
 * 
 * Tipo:
 * EntradaForo asociada a un usuario
 * 
 * Clase de equivalencia valida:
 * Crear EntradaForo creando un usuario ahi mismo
 * 
 * Clase de equivalencia invalida:
 * Crear EntradaForo consultando un usuario inexistente
 * 
 * ----------------------------------------------------------
 * 
 * 2)
 * 
 * Condicion de entrada:
 * EntradaForo
 * 
 * Tipo:
 * EntradaForo Con formato de fecha correcto
 * 
 * Clase de equivalencia valida:
 * Utilizar un formato de fecha valido
 * 
 * Clase de equivalencia invalida:
 * Utilizar una fecha incoherente
 */

public class EntradasForoTest {
    ServiciosForoStub principal;
    
    public EntradasForoTest() {
    }
    
    @Before
    public void setUp() {
        principal = new ServiciosForoStub();
    }
    
    
    @Test
    public void registroPacienteTest(){
        Usuario us = new Usuario("pepitoperez@gmail.com", "Pepito Perez");
        EntradaForo ef = new EntradaForo(12, us, "Nueva entrada", "Entrada correcta", java.sql.Date.valueOf("2010-03-01"));
    }
    
    
}
