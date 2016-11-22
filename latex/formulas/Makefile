# My makefile for this latex project

# To use this, you need to have installed the following programs:
#   * Texlive (or other Latex distibution) for pdflatex
#   * pdftk
#   * pdfcrop
# All of them should be installable through the repositories of your
# Linux distribution.

# This make script runs pdflatex on a source file and produces the
# formulas in separate files that are cropped completely. You just need
# to make sure that each formula is on a separate page in the PDF and
# that this page contains only the formula.

# Usage:
#   make
#     Produce final (cropped) formulas
#   make clean
#     Remove unnecessary generated files
#   make clean-full
#     Remove all generated files

# Use Bash shell instead of sh
SHELL := /bin/bash

# This stores the name of our latex source file with the formulas
# (without the ending ".tex")
BASEFILENAME = formulas

# Define extra files that are generated but not used
CLEANDATEIEN = $(BASEFILENAME).aux $(BASEFILENAME).log $(BASEFILENAME).nav $(BASEFILENAME).out $(BASEFILENAME).snm $(BASEFILENAME).toc doc_data.txt

# Main recipe
all: $(BASEFILENAME).tex
	# Run pdflatex on source file
	# ("timeout 5" can be removed without harm.)
	timeout 5 pdflatex $(BASEFILENAME).tex
	timeout 5 pdflatex $(BASEFILENAME).tex
	#
	# Split each page of the PDF in a separate file
	pdftk $(BASEFILENAME).pdf burst output $(BASEFILENAME)_%04d.pdf
	#
	# Crop each resulting PDF. This crops all but the visible stuff on a
	# page, so make sure that the page does not contain more than you want
	# (e.g. page number, formula counting)
	for i in $(BASEFILENAME)_[0-9][0-9][0-9][0-9].pdf; \
	do pdfcrop "$$i" "$$i"; done


# Remove generated files except PDFs
clean:
	rm -f $(CLEANDATEIEN)

# Remove all generated files
clean-full:
	rm -f $(CLEANDATEIEN) $(BASEFILENAME)*.pdf

.PHONY: all clean clean_full
