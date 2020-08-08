package com.cfl.socialservices.domain;

public class StudentWrapper {

    private Student personalInformation;

    private ImmediateNeeds immediateNeeds;

    private OtherProviders otherProviders;

    private EnglishFluency englishFluency;

    private Housing housing;

    private CollateralNeeds collateralNeeds;

    private MentalHealth mentalHealth;

    private DomesticViolence domesticViolence;

    public Student getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(Student personalInformation) {
        this.personalInformation = personalInformation;
    }

    public ImmediateNeeds getImmediateNeeds() {
        return immediateNeeds;
    }

    public void setImmediateNeeds(ImmediateNeeds immediateNeeds) {
        this.immediateNeeds = immediateNeeds;
    }

    public OtherProviders getOtherProviders() {
        return otherProviders;
    }

    public void setOtherProviders(OtherProviders otherProviders) {
        this.otherProviders = otherProviders;
    }

    public EnglishFluency getEnglishFluency() {
        return englishFluency;
    }

    public void setEnglishFluency(EnglishFluency englishFluency) {
        this.englishFluency = englishFluency;
    }

    public Housing getHousing() {
        return housing;
    }

    public void setHousing(Housing housing) {
        this.housing = housing;
    }

    public CollateralNeeds getCollateralNeeds() {
        return collateralNeeds;
    }

    public void setCollateralNeeds(CollateralNeeds collateralNeeds) {
        this.collateralNeeds = collateralNeeds;
    }

    public MentalHealth getMentalHealth() {
        return mentalHealth;
    }

    public void setMentalHealth(MentalHealth mentalHealth) {
        this.mentalHealth = mentalHealth;
    }

    public DomesticViolence getDomesticViolence() {
        return domesticViolence;
    }

    public void setDomesticViolence(DomesticViolence domesticViolence) {
        this.domesticViolence = domesticViolence;
    }
}
