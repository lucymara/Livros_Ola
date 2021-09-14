package application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.asm.Advice.Return;

@Entity
@Table(name="livros")

public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
private String titulo;
public String getTitulo() {
    return titulo;
}
public static void setTitulo(String titulo) {
    this.titulo = titulo;
}

}


