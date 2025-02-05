package com.candidatsae.candidatsae6;

import java.util.List;

public interface ICandidat {

public Candidat saveCandidat(Candidat candidat);
public Candidat deleteCandidat(int id);
public Candidat updateCandidat(Candidat candidat);
public Candidat getCandidatById(int id);
public List<Candidat> getAllCandidats();

}
