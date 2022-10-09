import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JLabel subPrograma;
    JLabel tablaDeMultiplicar;
    JComboBox numeros;
    JFrame superior = new JFrame();
    JFrame todo = new JFrame();

    JFrame central = new JFrame();
    public Ventana (){


        //Creamos el contenedor "norte" donde añadiremos los elementos que irán en la parte superior
        Container norte = superior.getContentPane();
        norte.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Creamos los elementos, los posicionamos y los añadimos a norte

        subPrograma = new JLabel("Subprograma");
        c.gridx=0;
        c.gridy=0;
        c.weightx=1;
        c.gridwidth=1;
        norte.add(subPrograma,c);


        tablaDeMultiplicar = new JLabel("Tabla de Multiplicar");
        c.gridx= 3;
        c.gridy= 2;
        c.gridheight=1;
        c.gridwidth=1;
        norte.add(tablaDeMultiplicar,c);

        numeros = new JComboBox();
        c.gridx=0;
        c.gridy=3;
        c.gridheight=1;
        c.gridwidth=1;
        c.fill= GridBagConstraints.HORIZONTAL;
        norte.add(numeros,c);


        //Añadimos las diferentes opciones al Combobox desplegable

        numeros.addItem(0);
        numeros.addItem(1);
        numeros.addItem(2);
        numeros.addItem(3);
        numeros.addItem(4);
        numeros.addItem(5);
        numeros.addItem(6);
        numeros.addItem(7);
        numeros.addItem(8);
        numeros.addItem(9);
        numeros.addItem(10);


        //Características propias de norte
        superior.setVisible(true);
        superior.setDefaultCloseOperation(EXIT_ON_CLOSE);
        superior.setSize(500, 800);
        superior.setTitle("Tabla de multiplicar");

        //Creamos el container centro, donde irán los botones de la parte central
        Container centro = central.getContentPane();
        int X = 3; int Y = 10;
        centro.setLayout(new GridLayout(X,Y));
        for (int i=0; i<Y; i++){
            centro.add(new JButton(i+""));
        }




        //Creamos el container total con un BorderLayout, que será el encargado de unir las 3 partes. Norte - centro - sur.
        Container total = todo.getContentPane();
        todo.setLayout(new BorderLayout());
        total.add(superior, BorderLayout.NORTH);
        total.add(central, BorderLayout.CENTER);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana();

    }

}
