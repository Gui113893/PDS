import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Iterator;

public class ToShare implements Iterable<Product>{
    private Map<String, Queue<Client>> productsToShare;
    private Map<String, Product> products;

    public ToShare() {
        this.productsToShare = new HashMap<>();
        this.products = new HashMap<>();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products.values());
    }

    public boolean add(Product p) {
        try {
            products.put(p.code(), p);
            productsToShare.put(p.code(), new LinkedList<>());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Product remove(String code) {
        for (Product p : products.values()) {
            if (p.code().equals(code)) {
                products.remove(code);
                productsToShare.remove(code);
                return p;
            }
        }
        return null;
    }

    public Product remove(Product p) {
        try {
            products.remove(p.code());
            productsToShare.remove(p.code());
            return p;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean share(String code, Client user) {
        if (products.containsKey(code)) {
            productsToShare.get(code).add(user);
            return true;
        }
        return false;
    }

    public boolean share(Product p, Client user) {
        return true;
    }

    public boolean giveBack(String code) {
        return true;
    }   

    public boolean giveBack(Product p) {
        return true;
    }

    public String allAlugados() {
        return null;
    }

    @Override
    public Iterator<Product> iterator() {
        return products.values().iterator();
    }
}
