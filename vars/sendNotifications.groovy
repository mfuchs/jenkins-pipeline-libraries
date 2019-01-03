#!/usr/bin/env groovy

/**
 * Send a slack notifications if the build status has changed
 */
def call(boolean buildStandalone)
{
	echo "### Inside boolean function"
	List channels = ['elem1']
	if (buildStandalone) {
		channels += 'elem2'
	}
	call(channels)
}

def call()
{
	echo "### Inside default function"
	call(false)
}

def call(List channels)
{
	echo "### Inside channel function $channels"
}

def call(Map vars) {
	echo "### Inside map function"
	if (vars.size() == 0) {
		call()
	} else if (vars.size() == 1 && vars.containsKey('buildStandalone')) {
		call(vars['buildStandalone'])
	} else {
		throw new IllegalArgumentException('WRONG STUFF')
	}
}
