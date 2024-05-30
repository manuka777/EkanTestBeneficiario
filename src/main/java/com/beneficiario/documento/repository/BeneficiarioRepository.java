package com.beneficiario.documento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.beneficiario.documento.vo.BeneficiarioVO;

public interface BeneficiarioRepository extends JpaRepository<BeneficiarioVO, Long> {
}

