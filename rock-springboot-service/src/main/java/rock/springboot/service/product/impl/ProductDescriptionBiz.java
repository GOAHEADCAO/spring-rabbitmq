package rock.springboot.service.product;

import com.oaup.dao.ProductDescriptionDao;
import com.oaup.support.model.po.ProductDescription;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDescriptionBiz {
	
	@Autowired
	private ProductDescriptionDao productDescriptionDao;
	
	public int insert(ProductDescription request){
    	return productDescriptionDao.insert(request);
    }
    
    public int insertBatch(List<ProductDescription> requests){
    	return productDescriptionDao.insertBatch(requests);
    } 
      
    public ProductDescription load(Long id){
    	
    	return productDescriptionDao.load(id);
    }
      
    public int update(ProductDescription request){
    	return productDescriptionDao.update(request);
    }  
      
    public int delete(Long id){
    	return productDescriptionDao.delete(id);
    } 
    

     public List<ProductDescription> query(ProductDescription request){
     
     	List<ProductDescription> queryList=productDescriptionDao.query(request);
     	if(CollectionUtils.isNotEmpty(queryList)){
			return queryList;
		}
		return new ArrayList<>();
		
    }

}