package frayDiego.docker1.demo;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.OrderedList;
/**
 * Clase para pintar nuestra pagina web
 */
@Route("")
public class MainView extends VerticalLayout {
	
	
	
	
	/**
	 * Constructor que se usa de pagina html
	 */
	public MainView() {
	    Button volver = new Button("Volver", event ->
        UI.getCurrent().getPage().setLocation("\\"));
    volver.setAutofocus(true);

    OrderedList lista = new OrderedList();
    lista.add(
        new ListItem("Alumno 1"),
        new ListItem("Alumno 2"),
        new ListItem("Alumno 3"),
        new ListItem("Alumno 4")
    );

    add(new H1("Listado de alumnos"));
    add(lista);
    add(volver);
}

	}
	