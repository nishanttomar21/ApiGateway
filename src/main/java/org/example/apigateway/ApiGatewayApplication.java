/**
 1. TODO [API Gateway]:
     An API Gateway is a crucial component in modern software architectures, particularly in microservices environments. It acts as a single entry point for managing and routing requests to various backend services, simplifying interactions between clients and APIs.

     Key Features of an API Gateway:
         A. API Traffic Management: The gateway efficiently manages incoming requests by routing them based on factors such as request paths and headers. This includes load balancing to distribute traffic evenly across backend services, enhancing scalability and availability.
         B. Protocol Translation: API Gateways can convert different protocols, allowing seamless communication between clients and backend services that may use varying data transmission methods.
         C. Security: They enforce security measures, including authentication and authorization, ensuring that only verified users can access specific APIs. This often involves integrating with existing security frameworks like OAuth or JWT.
         D. Rate Limiting: To prevent abuse and manage load on backend services, API Gateways implement rate limiting, controlling the number of requests a user can make within a certain timeframe.
         E. Caching: By storing frequently requested data, API Gateways reduce the load on backend services and improve response times for users.
         F. Monitoring and Analytics: They provide tools for tracking API usage and performance metrics, helping organizations understand how their APIs are being utilized and identify areas for improvement.
         G. Developer Portal: Many API Gateways include a developer portal that offers documentation, testing tools, and resources for developers to easily integrate with the APIs.
         H. API Transformation: This feature allows the gateway to modify request and response payloads, facilitating transitions between different API architectures (e.g., from SOAP to REST) and accelerating development cycles.
         I. Load Balancing: By distributing incoming requests among multiple instances of a service, API Gateways enhance both the scalability of applications and their resilience against failures.
         J. Cost Efficiency: They optimize resource allocation by reducing direct backend service calls and managing traffic effectively, leading to cost savings for organizations.

     In summary, an API Gateway not only simplifies the management of APIs but also enhances security, performance, and user experience through its diverse features. It serves as a vital tool in building robust applications that require efficient communication between multiple services.

 2. TODO [Some points to remember]:
     - Some API Gateways have built-in service discovery capabilities.
     - Others can integrate with external service discovery tools like Consul, Eureka, or etcd.
     - In some architectures, the API Gateway queries the service registry to get the locations of microservices.
     - Alternatively, the service registry can push updates to the API Gateway when service locations change.
     - Service discovery is primarily used by the API Gateway to find microservices, not for clients to find the gateway.
     - The API Gateway usually serves as a single, stable entry point for clients to access the microservices. Its address is generally static and well-known.
     - API Gateway service will not have any API endpoints, only routes incoming requests to the appropriate microservices and hence we have not added dependency for spring-web (spring-boot-starter-web).

 */

package org.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
