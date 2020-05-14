/**
 * 
 */
package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.bean.ParticipantEnrolled;
import com.cg.bean.TrainingProgram;

/**
 * @author Uma Shankar
 *
 * 04-May-2020 2:47:00 pm
 */
public interface TrainingProgramMaintainance {
	
	//Training Program specific functions
	List<TrainingProgram> getAllTrainingProgram();
	TrainingProgram getTrainingProgramById(Integer trainingCode );
	TrainingProgram addTrainingProgram(TrainingProgram trainingProgram);
	Boolean deleteTrainingProgram(Integer trainingCode);
	
	//Participant Enrollment 
	ParticipantEnrolled enrollParticipant(Employee employee , TrainingProgram tp);
	TrainingProgram getTrainingProgramByParticipantId(Integer participantId);
	List<ParticipantEnrolled> getAllParticipantEnrolled();
	void deleteAllEnrolledParticipant(Integer trainingCode);
	
	
}
