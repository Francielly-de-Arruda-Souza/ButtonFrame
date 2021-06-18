/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttontest;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame 
{
   private  JButton plainJButton; // botão apenas com texto
   private  JButton fancyJButton; // botão com ícones

   // ButtonFrame adiciona JButtons ao JFrame

 
   public ButtonFrame()
   {
      super( "Testing Buttons" );
      setLayout( new FlowLayout() ); // configura o layout de frame

      plainJButton = new JButton( "Plain Button" ); // botão com texto
      add( plainJButton ); // adiciona plainJButton ao JFrame

      Icon bug1 = new ImageIcon (  getClass( ).getResource(  " " ));
      Icon bug2 = new ImageIcon( getClass( ).getResource(  " " )  );
      fancyJButton = new JButton(  "Fancy Button",  bug1  ); // configura a imagem
      fancyJButton.setRolloverIcon(  bug2  ); // configura imagem de rolagem
      add(  fancyJButton  ); // adiciona fancyJButton ao JFrame

      // cria novo ButtonHandler para tratamento de evento de botão
      ButtonHandler handler = new ButtonHandler();         
      fancyJButton.addActionListener( handler );           
      plainJButton.addActionListener( handler );           
   } // fim do construtor ButtonFrame

   // classe interna para tratamento de evento de botão
   private class ButtonHandler implements ActionListener
   {
      // trata evento de botão
      @Override
      public void actionPerformed(  ActionEvent event  )
      {
         JOptionPane.showMessageDialog(ButtonFrame.this,  String.format (  "Você presssionou o botão: %s",  event.getActionCommand( ) )  );
      } // fim do método actionPerformed
   } // fim da classe ButtonHandler private interna
} // fim da classe ButtonFrame
