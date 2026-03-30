package com.bridgelabz.generics.aidrivenresumescreeningsystem;

class AIScreener {

    // Generic method for resume screening
    public static <T extends JobRole> boolean screenResume(Resume<T> resume) {
        return resume.getJobRole()
                     .isQualified(resume.getExperience(), resume.getSkillScore());
    }
}
