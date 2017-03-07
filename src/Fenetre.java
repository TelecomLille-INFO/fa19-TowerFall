import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Fenetre extends JFrame{
	boolean music=false;
	
	public Fenetre() throws IOException{
		Jukebox juke=new Jukebox();
		juke.start();
		this.setTitle("Unicorn ISLAND");
		this.setMinimumSize(new Dimension(1200,800));
		this.setSize(1200,800 );
		this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    this.setResizable(false);
	    GridLayout gl=new GridLayout(4,1,100,75);
	    JButton bout1=new JButton("GAME");
	    JButton bout2=new JButton("Fast GAME");
	    JButton bout3=new JButton("OPTION");
	    JButton bout4=new JButton("EXIT");
	    
	    bout4.addActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent event){
	    		  juke.stop();
	    		  exit();
	    	  }
	    });
	    
	    JPanel pan=new JPanel(gl);
	    pan.setSize(800, 550);
	    pan.setOpaque(false);
	    pan.add(bout1);
	    pan.add(bout2);
	    pan.add(bout3);
	    pan.add(bout4);
	    JLabel lab=new JLabel(new ImageIcon("lib/background/menu.gif"));
	    JPanel pan2=new JPanel();
	    pan2.setSize(1200, 800);
	    pan2.add(lab);
	    pan.setLocation(200,200);
	    this.add(pan);
	    this.add(pan2);
	    this.pack();
		this.setVisible(true);
		if (music=false){
			music=true;
		}
	}
	
	public void exit(){
		this.dispose();
		System.exit(0);
	}
	
	
}