package com.bridgelabz.generics.aidrivenresumescreeningsystem;

class Resume<T extends JobRole> {

    private final String candidateName;
    private final int experience;
    private final int skillScore;
    private final T jobRole;

    public Resume(String candidateName, int experience, int skillScore, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.skillScore = skillScore;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

    public int getSkillScore() {
        return skillScore;
    }

    public T getJobRole() {
        return jobRole;
    }
}
