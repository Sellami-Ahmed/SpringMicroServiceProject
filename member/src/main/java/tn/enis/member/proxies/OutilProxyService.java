package tn.enis.member.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.enis.member.beans.OutilBean;

@FeignClient(name = "OUTIL-SERVICE")
public interface OutilProxyService {
    @GetMapping("/api/v1/outils/{id}")
    OutilBean getOutilById (@PathVariable Long id);
}
