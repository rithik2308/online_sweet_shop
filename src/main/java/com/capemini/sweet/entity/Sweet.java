package com.capemini.sweet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tablesweet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Sweet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long sweetId;
    private String sweetname;
    private double sweetprice;
    private int sweetstock;
}