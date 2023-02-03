/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.kaisha.modern.api;

import com.kaisha.modern.api.model.Product;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Product", description = "the Product API")
public interface ProductApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /api/v1/products/{id} : Returns a product
     * Returns the product that matches the given product ID
     *
     * @param id Product Identifier (required)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns a product", nickname = "getProduct", notes = "Returns the product that matches the given product ID", response = Product.class, tags={ "product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Product.class) })
    @RequestMapping(value = "/api/v1/products/{id}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Product> getProduct(@ApiParam(value = "Product Identifier",required=true) @PathVariable("id") String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 0.8008281904610115, \"imageUrl\" : \"imageUrl\", \"name\" : \"name\", \"count\" : 6, \"description\" : \"description\", \"id\" : \"id\", \"tag\" : [ \"tag\", \"tag\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>aeiou</id> <name>aeiou</name> <description>aeiou</description> <imageUrl>aeiou</imageUrl> <price>3.149</price> <count>123</count> <tag>aeiou</tag> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/products : Returns all the matched products
     * Returns the products that matches the given query criteria
     *
     * @param tag Product tag (optional)
     * @param name Product name (optional)
     * @param page Query page number (optional, default to 1)
     * @param size Query page size (optional, default to 10)
     * @return For successful fetch. (status code 200)
     */
    @ApiOperation(value = "Returns all the matched products", nickname = "queryProducts", notes = "Returns the products that matches the given query criteria", response = Product.class, responseContainer = "List", tags={ "product", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "For successful fetch.", response = Product.class, responseContainer = "List") })
    @RequestMapping(value = "/api/v1/products",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Product>> queryProducts(@ApiParam(value = "Product tag") @Valid @RequestParam(value = "tag", required = false) String tag,@ApiParam(value = "Product name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Query page number", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue="1") Integer page,@ApiParam(value = "Query page size", defaultValue = "10") @Valid @RequestParam(value = "size", required = false, defaultValue="10") Integer size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 0.8008281904610115, \"imageUrl\" : \"imageUrl\", \"name\" : \"name\", \"count\" : 6, \"description\" : \"description\", \"id\" : \"id\", \"tag\" : [ \"tag\", \"tag\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>aeiou</id> <name>aeiou</name> <description>aeiou</description> <imageUrl>aeiou</imageUrl> <price>3.149</price> <count>123</count> <tag>aeiou</tag> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
