package microservices.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import microservices.organizationservice.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByOrganizationCode(String organizationCode);
}
