package microservices.organizationservice.service.impl;

import lombok.AllArgsConstructor;
import microservices.organizationservice.dto.OrganizationDto;
import microservices.organizationservice.entity.Organization;
import microservices.organizationservice.mapper.OrganizationMapper;
import microservices.organizationservice.repository.OrganizationRepository;
import microservices.organizationservice.service.OrganizationService;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationDto saveOrganization(OrganizationDto organizationDto) {

        // convert OrganizationDto into Organization jpa entity
        Organization organization = OrganizationMapper.mapToOrganization(organizationDto);

        Organization savedOrganization = organizationRepository.save(organization);

        return OrganizationMapper.mapToOrganizationDto(savedOrganization);
    }

    @Override
    public OrganizationDto getOrganizationByCode(String organizationCode) {
        Organization organization = organizationRepository.findByOrganizationCode(organizationCode);
        return OrganizationMapper.mapToOrganizationDto(organization);
    }
}
