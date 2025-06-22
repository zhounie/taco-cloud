package zn.taco_cloud;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Document
public class TacoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private Date placedAt = new Date();

    @NotBlank(message="deliveryName is required")
    private String deliveryName;
    
    @NotBlank(message="deliveryStreet is required")
    private String deliveryStreet;
    
    @NotBlank(message="deliveryCity is required")
    private String deliveryCity;

    @NotBlank(message="deliveryState is required")
    private String deliveryState;

    @NotBlank(message="deliveryZip is required")
    private String deliveryZip;

    private String ccNumber;

    private String ccExpiration;
    
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }

}
