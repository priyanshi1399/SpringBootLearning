package com.priyanshi.LearningSpringBoot.Service;

import com.priyanshi.LearningSpringBoot.DTO.PaymentRequest;
import com.priyanshi.LearningSpringBoot.DTO.PaymentResponse;
import com.priyanshi.LearningSpringBoot.Entity.PaymentEntity;
import com.priyanshi.LearningSpringBoot.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){

        PaymentEntity paymentModel=paymentRepository.getPaymentById(internalRequestObj);

        PaymentResponse paymentResponse=mapModelToReponseDTO(paymentModel);
        return paymentResponse;
    }

    private  PaymentResponse mapModelToReponseDTO(PaymentEntity paymentEntity){
        PaymentResponse response=new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return response;
    }

}
