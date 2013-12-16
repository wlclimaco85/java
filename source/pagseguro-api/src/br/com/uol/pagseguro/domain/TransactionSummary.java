/*
 ************************************************************************
 Copyright [2011] [PagSeguro Internet Ltda.]

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 ************************************************************************
 */

package br.com.uol.pagseguro.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Represents a summary of a PagSeguro transaction, typically returned by search
 * services.
 */
public class TransactionSummary {
    
    /** Transaction date */
    private Date date;
    
    /**
     * Last event date Date the last notification about this transaction was
     * sent
     */
    private Date lastEvent;
    
    /** Transaction Code. */
    private String code;
    
    /** Transaction Reference. */
    private String reference;
    
    /** Transaction Gross Amount. */
    private BigDecimal grossAmount;
    
    /** Transaction Type */
    private TransactionType type;
    
    /**
     * Transaction status
     * 
     * @see TransactionStatus
     */
    private TransactionStatus status;
    
    /**
     * Net amount
     */
    private BigDecimal netAmount;
    
    /**
     * Discount amount
     */
    private BigDecimal discountAmount;
    
    /**
     * Fee amount
     */
    private BigDecimal feeAmount;
    
    /**
     * Extra amount
     */
    private BigDecimal extraAmount;
    
    /** Payment Method. */
    private PaymentMethod paymentMethod;
    
    /**
     * Get Status
     * 
     * @return TransactionStatus
     */
    public TransactionStatus getStatus() {
        
        if (this.status == null) {
            this.status = new TransactionStatus();
        }
        
        return this.status;
        
    }

    /**
     * Set Status
     * 
     * @param status
     */
    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    /**
     * Get Net Amount
     * 
     * @return BigDecimal
     */
    public BigDecimal getNetAmount() {
        return this.netAmount;
    }

    /**
     * Set net Amount
     * 
     * @param netAmount
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     * Get discount amount
     * 
     * @return BigDecimal
     */
    public BigDecimal getDiscountAmount() {
        return this.discountAmount;
    }

    /**
     * Set Discount amount
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Get Fee Amount
     * 
     * @return BigDecimal
     */
    public BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    /**
     * Set Fee Amount
     * 
     * @param feeAmount
     */
    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Get Extra Amount
     * 
     * @return
     */
    public BigDecimal getExtraAmount() {
        return this.extraAmount;
    }

    /**
     * Set Extra Amount
     * 
     * @param extraAmount
     */
    public void setExtraAmount(BigDecimal extraAmount) {
        this.extraAmount = extraAmount;
    }

    /**
     * Get Last Event
     * 
     * @return Date
     */
    public Date getLastEvent() {
        if (this.lastEvent == null) {
            this.lastEvent = new Date();
        }
        return this.lastEvent;
    }

    /**
     * Set Last Event
     * 
     * @param lastEvent
     */
    public void setLastEvent(Date lastEvent) {
        this.lastEvent = lastEvent;
    }

    /**
     * Set Payment Method
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Get Payment Method
     * 
     * @return PaymentMethod
     */
    public PaymentMethod getPaymentMethod() {
        
        if (this.paymentMethod == null) {
            this.paymentMethod = new PaymentMethod();
        }
        
        return this.paymentMethod;
        
    }

    /**
     * Get Date
     * 
     * @return Date
     */
    public Date getDate() {
        
        if (this.date == null) {
            this.date = new Date();
        }
        
        return this.date;
        
    }

    /**
     * Set Date
     * 
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get Code
     * 
     * @return String
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set Code
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get Reference
     * 
     * @return String
     */
    public String getReference() {
        return this.reference;
    }

    /**
     * Set Reference
     * 
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Get Gross Amount
     * 
     * @return BigDecimal
     */
    public BigDecimal getGrossAmount() {
        return this.grossAmount;
    }

    /**
     * Set Gross Amount
     * 
     * @param grossAmount
     */
    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    /**
     * Get TransactionType
     * 
     * @return TransactionType
     */
    public TransactionType getType() {
        
        if (this.type == null) {
            this.type = new TransactionType();
        }
        
        return this.type;
        
    }

    /**
     * Set TransactionType
     * 
     * @param type
     */
    public void setType(TransactionType type) {
        this.type = type;
    }

    /**
     * return string
     */
    @Override
    public String toString() {
        return "Status: " + this.status;
    }

}