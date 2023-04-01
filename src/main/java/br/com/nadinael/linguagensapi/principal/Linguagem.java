package br.com.nadinael.linguagensapi.principal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "linguagens")
public class Linguagem {
    @Id
    private String id;
    private String title;
    private String image;
    private int ranking;

    public String getId(){
    return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
    public int getRanking() {
        return ranking;
    }
    
    public Linguagem(String title, String image, int ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public Linguagem() {
        //System.out.println("CONSTRUINDO OBJETO.");
        if(this.title == null){
            this.title = "exemplificado.";
        }
    }

    

}
