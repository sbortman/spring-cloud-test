package omar.cloud.test

import org.springframework.beans.factory.annotation.Value

class FooController {
    @Value('${foo}')
    String foo 

    def index() { 
        render contentType: 'text/plain', text: foo
    }
}
