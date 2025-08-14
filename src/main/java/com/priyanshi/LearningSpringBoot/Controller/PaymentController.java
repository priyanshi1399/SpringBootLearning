package com.priyanshi.LearningSpringBoot.Controller;

import com.priyanshi.LearningSpringBoot.DTO.PaymentRequest;
import com.priyanshi.LearningSpringBoot.DTO.PaymentResponse;
import com.priyanshi.LearningSpringBoot.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id){

        //map incoming data to internal request DTO
        PaymentRequest internalRequestObj=new PaymentRequest();
        internalRequestObj.setPaymentId(id);

        PaymentResponse payment=paymentService.getPaymentDetailsById(internalRequestObj);

        return  ResponseEntity.ok(payment);

    }

}
