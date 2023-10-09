package prueba.tecnica.API.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PetModel {
    private Integer id;
    private String name;
    private CategoryModel category;
    private List<String> photoUrls;
    private String status;
    private List<Tag> tags;

}

