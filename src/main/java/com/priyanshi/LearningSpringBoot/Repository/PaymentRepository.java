package com.priyanshi.LearningSpringBoot.Repository;


import com.priyanshi.LearningSpringBoot.DTO.PaymentRequest;
import com.priyanshi.LearningSpringBoot.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {


    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel=executeQuery(request);
        return paymentModel;
    }

    public PaymentEntity executeQuery(PaymentRequest request){

        //connect with DB and fetch the data

        PaymentEntity payment=new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }


}
