package laboratory;

import domain.Product;

import java.util.List;

public abstract class QualityLaboratory {
    public List<Product> product_list;

    public abstract QualitySheet test_quality(Product product);
}
