/**
 * 
 */
package store.shopping.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import store.shopping.model.Customer;

/**
 * @author Luis
 *
 */
//@FeignClient(name = "customer-service", fallback = CustomerHystrixFallbackFactory.class)
public interface CustomerClient {

//    @GetMapping(value = "/customers/{id}")
//    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
