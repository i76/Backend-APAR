/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.portfolio.apar.Repository;

import com.portfolio.apar.Entity.Acercade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface IAcercadeRepository extends JpaRepository<Acercade,Long>{
    
}
