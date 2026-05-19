package com.frayd.dam.Docker;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainView() {
       Button volver = new Button("Volver" , event -> UI.getCurrent().getPage().setLocation("\\"));
       
       volver.setAutofocus(true);
       
       orderedList Lista = new OrderedList();
       
       add(new H1("Listado de ALumnos"));
       add(volver);
    }
}
